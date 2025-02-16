# FILE-HANDLING-UTILITY
# COMPANY : CODTECH IT SOLUTIONS
# NAME :  BANOTH MAHESH KUMAR
# INTERN ID : CT08SOI
# DOMAIN : Java Programming
# DURATION : 4 WEEKS
# MENTOR : Neela Santhosh Kumar 
## Overview :
Java provides robust support for file input/output (I/O) operations, and understanding how to read, write, and modify text files is fundamental for working with files. File I/O operations are widely used in various applications, ranging from saving user-generated data to reading logs or configuration files. This Java program demonstrates how to handle basic file operations in an easy-to-understand and beginner-friendly way.
Key File Operations:
Writing to a File: Writing data to a file involves either creating a new file or overwriting an existing file. Java provides the BufferedWriter and FileWriter classes to perform these tasks. When we write data to a file, it is important to ensure that the file is properly closed after writing to avoid data loss.
Reading from a File: Reading data from a file involves fetching its content line by line. The BufferedReader and FileReader classes are typically used for this purpose. It's important to handle the case when the file may not exist or may be empty to prevent runtime errors.
Modifying a File (Appending Data): Modifying or appending data to a file involves adding new content without affecting the existing content. This is done by using FileWriter with the true parameter, which allows appending rather than overwriting the content.
