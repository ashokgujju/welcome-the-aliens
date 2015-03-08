## Welcome the Aliens - A Java Console Application
Welcome the aliens and help them to get a identity card to stay on the earth.

Created using JDK 1.8

iText 5.5.5 Java library is used to generate pdf files.

Apache Common io 2.4 java library is used to search for classes in the directory.

##How to run

Clone the repository

<pre>$ git clone https://github.com/ashokgujju/welcome-the-aliens.git </pre>

Import the project into Eclipse IDE and run.

Output files will be generated in the project directory.

##How to add new export formatter

Create a new class with name as 'something'FormatGenerator.java, like PdfFormatGenerator.java

Implement FileGenerator interface

Return file type name in getFileType() method

Write code to export data to file in export() method
