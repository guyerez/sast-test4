Imports System.IO
Imports Microsoft.AspNetCore.Mvc

Public Class FileController
    Inherits Controller

    Public Function DownloadFile(filename As String) As IActionResult
        Dim filePath As String = "C:\uploads\" & filename
        Dim content As String = File.ReadAllText(filePath)
        Return Content(content)
    End Function

    Public Function ReadDocument() As IActionResult
        Dim docName As String = Request.Query("document")
        Dim bytes As Byte() = File.ReadAllBytes("C:\docs\" & docName)
        Return File(bytes, "application/octet-stream")
    End Function
    Public Function ReadDocument() As IActionResult
        Dim docName As String = Request.Query("document")
        Dim bytes As Byte() = File.ReadAllBytes("C:\docs\" & docName)
        Return File(bytes, "application/octet-stream")
    End Function

    Public Function ViewLog() As IActionResult
        Dim logFile As String = Request.Form("logfile")
        Dim stream As New StreamReader("C:\logs\" & logFile)
        Dim content As String = stream.ReadToEnd()
        stream.Close()
        Return Content(content)
    End Function

    Public Sub ProcessFile(inputPath As String)
        Dim data As String() = File.ReadAllLines(inputPath)
        Console.WriteLine(data.Length)
    End Sub

    Public Async Function ReadAsync(path As String) As Task(Of String)
        Dim fileStream As FileStream = File.OpenRead(path)
        Return "done"
    End Function

End Class

Module Program
    Sub Main()
    End Sub
End Module
