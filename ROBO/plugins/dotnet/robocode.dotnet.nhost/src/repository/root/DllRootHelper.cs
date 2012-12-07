#region Copyright (c) 2001-2012 Mathew A. Nelson and Robocode contributors

// Copyright (c) 2001-2012 Mathew A. Nelson and Robocode contributors
// All rights reserved. This program and the accompanying materials
// are made available under the terms of the Eclipse Public License v1.0
// which accompanies this distribution, and is available at
// http://robocode.sourceforge.net/license/epl-v10.html

#endregion

using System;
using System.IO;
using System.Web;
using net.sf.robocode.dotnet.host.seed;
using net.sf.robocode.repository;

namespace net.sf.robocode.dotnet.repository.root
{
    public static class DllRootHelper
    {
        private static AppDomainShell shell;

        public static void Refresh()
        {
            if (shell!=null)
            {
                shell.Dispose();
            }
            shell = new AppDomainShell();
            shell.Init(false);
        }

        public static string[] findItems(string dllPath)
        {
            string uriPath = dllPath.Replace("#", "%23"); // All '#' occurrences must be replaced
            string file = new Uri(uriPath).LocalPath;
            if (!File.Exists(file))
            {
                throw new FileNotFoundException("File not found: " + dllPath);
            }

            if (shell != null)
            {
                shell.Open(file);
                return shell.FindRobots();
            }
            using (AppDomainShell localshell = new AppDomainShell())
            {
                localshell.Init(false);
                localshell.Open(file);
                return localshell.FindRobots();
            }
        }

        public static RobotType GetRobotType(IRobotRepositoryItem robotRepositoryItem)
        {
            string file = GetDllFileName(robotRepositoryItem);
            if (!File.Exists(file))
            {
                return RobotType.Invalid;
            }
            if (shell != null)
            {
                shell.Open(file);
                return shell.GetRobotType(robotRepositoryItem.getFullClassName());
            }
            using (AppDomainShell localshell = new AppDomainShell())
            {
                localshell.Init(false);
                localshell.Open(file);
                return localshell.GetRobotType(robotRepositoryItem.getFullClassName());
            }
        }

        public static string GetDllFileName(IRobotRepositoryItem robotRepositoryItem)
        {
            string uriString = robotRepositoryItem.getClassPathURL().toURI().toString();
            string trim = uriString.Substring(0, uriString.LastIndexOf(".dll!/") + 4);
            return new Uri(trim).LocalPath;
        }
    }
}