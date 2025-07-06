# Java Template files for Compeditive Programming

Use file `FastReader_Template.java`. Period!

## VS Code extensions required -

- CPH - compeditive programming helper
- CP Companion - Compeditive companion
- C/C++ Extension pack
- Code Runner

## Commands -

1. `Ctrl + Alt + B` for running all TCs.

2. `Ctrl + Shift + B` for running custom input.

### Use the `tasks.json` file from the `.vscode` folder.

## NOTE -

### IF YOU WANT YOU CAN COPY THE TEMPLATES FROM `templates/template-for-CP.json` file in the repo.

## TEMPLATE SHORTCUTS -

- `scn` for Scanner class IO. (slowest)

- `br` for BufferedReader class IO (fast)

- `fr` for FastReader class IO (faster and easy) (RECOMMENDED)

- `re` for Reader class IO (fastest) (NOT EASY)

### 1. Scanner Class

(easy, less typing, but not recommended very slow)

In most of the cases, we get TLE while using scanner class. It uses built-in nextInt(), nextLong(), nextDouble methods to read the desired object after initiating scanner object with the input stream(e.g. System.in). The following program many times gets time limit exceeded verdict and therefore not of much use.

#### [Reasons for slowness](https://www.geeksforgeeks.org/difference-between-scanner-and-bufferreader-class-in-java/)

### 2. BufferedReader (fast, but not recommended as it requires a lot of typing):

The Java.io.BufferedReader class reads text from a character-input stream, buffering characters to provide for the efficient reading of characters, arrays, and lines. With this method, we will have to parse the value every time for the desired type. Reading multiple words from a single line adds to its complexity because of the use of Stringtokenizer and hence this is not recommended. These get accepted with a running time of approx 0.89 s.but still as you can see it requires a lot of typing altogether and therefore method 3 is recommended.

### 3.Userdefined FastReader Class (which uses bufferedReader and StringTokenizer):

This method uses the time advantage of BufferedReader and StringTokenizer and the advantage of user-defined methods for less typing and therefore a faster input altogether. These get accepted with a time of 1.23 s and this method is very much recommended as it is easy to remember and is fast enough to meet the needs of most of the question in competitive coding.

### 4.Using Reader Class:

There is yet another fast way through the problem, I would say the fastest way but is not recommended since it requires very cumbersome methods in its implementation. It uses inputDataStream to read through the stream of data and uses read() method and nextInt() methods for taking inputs. This is by far the fastest ways of taking input but is difficult to remember and is cumbersome in its approach. Below is the sample program using this method. These get accepted with a surprising time of just 0.28 s. Although this is ultra-fast, it is clearly not an easy method to remember.
