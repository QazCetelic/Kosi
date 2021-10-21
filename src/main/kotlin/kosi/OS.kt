package kosi

import kosi.detection.unixLikeDetection
import kosi.detection.windowsDetection
import java.io.File

/*
╔═════════════════╤════════════╤════════════╤════════════╤═══════════════╤═══════════════╤══════════════════════╤══════════════════════╗
║ Java/OS version │ Windows 95 │ Windows 98 │ Windows XP │ Windows Vista │ Windows 7     │ Windows 8            │ Windows 8.1          ║
╟─────────────────┼────────────┼────────────┼────────────┼───────────────┼───────────────┼──────────────────────┼──────────────────────╢
║ 1.4.2           │ Windows 95 │ Windows 98 │ Windows XP │ Windows Vista │ Windows Vista │ Windows Vista        │ Windows Vista        ║
║                 │        4.0 │       4.10 │        5.1 │           6.0 │           6.1 │                  6.2 │                  6.2 ║
║ 1.5.0           │ Windows 95 │ Windows 98 │ Windows XP │ Windows Vista │ Windows 7     │ Windows NT (unknown) │ Windows NT (unknown) ║
║                 │        4.0 │       4.10 │        5.1 │           6.0 │           6.1 │                  6.2 │                  6.2 ║
║ 1.6.0           │ Windows 95 │ Windows 98 │ Windows XP │ Windows Vista │ Windows 7     │ Windows 8            │ Windows 8            ║
║                 │        4.0 │       4.10 │        5.1 │           6.0 │           6.1 │                  6.2 │                  6.2 ║
║ 1.7.0           │ Windows 95 │ Windows 98 │ Windows XP │ Windows Vista │ Windows 7     │ Windows 8            │ Windows 8.1          ║
║                 │        4.0 │       4.10 │        5.1 │           6.0 │           6.1 │                  6.2 │                  6.3 ║
║ 1.8.0           │ Windows 95 │ Windows 98 │ Windows XP │ Windows Vista │ Windows 7     │ Windows 8            │ Windows 8.1          ║
║                 │        4.0 │       4.10 │        5.1 │           6.0 │           6.1 │                  6.2 │                  6.3 ║
╚═════════════════╧════════════╧════════════╧════════════╧═══════════════╧═══════════════╧══════════════════════╧══════════════════════╝
No list, but on Windows7, with a JDK6_u18:

osName.equalsIgnoreCase("Windows ME")
EXAMPLES

kosi.Linux
amd64
4.9.0-14-amd64

Windows 10
amd64
10.0
*/

// Uses a function instead to make it clear that you shouldn't use it directly
/**
 * Create a variable and use type checks on it
 */
fun currentOS(): OSType = os
val os  =  if (File.separator == "/") unixLikeDetection()
           else windowsDetection()