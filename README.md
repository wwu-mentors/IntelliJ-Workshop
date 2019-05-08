# IntelliJ-Workshop

## What's an IDE?
   - An integrated development environment (IDE) is a piece of software that *should* make your life as a programmer easier.
   - Some examples of IDEs: jGRASP, Eclipse, Netbeans, VSCode, PyCharm, and IntelliJ.
   
   ### Purpose
   1. Help the user write code with the use of several common features
   2. Compile and run the code completely within the IDE
   3. Sometimes, provide GUI elements in attempt to abstract ugly details of coding
   
   ### Common Features
   1. Source code editting
   2. Syntax highlighting
   3. Code completion
   4. Easy refactoring
   5. Code cleanup
   6. Debugging
   7. Version control support (e.g. Git, Mercurial)
   8. Easy project navigation
   
   ### Pros of IDEs
   1. Makes coding faster
   2. Cleans up our mess
   3. Useful when projects get big
   4. Lots of options
   
   ### Cons of IDEs
   1. Gotta jump through some hoops during setup
   2. Arguably, make us reliant on the features they provide
   3. Often do not support all common programming languages
   4. Lots of options
   5. Builds its own file structure so can be difficult to use existing files.

## Getting started with IntelliJ
   1. Click "Create New Project".
   2. Select Java (on upper left side).
   3. Click "Next".
   4. Next screen will ask you to select a template. Just click "Next".
   5. Name your project and make sure its in the directory you want.
   6. Click "Finish".
   
   ### Adding a Java class
   1. First, make sure you're in your source (src) folder.
   2. Then File > New.
   3. Now click on "Java class".
   4. Name your file and start coding!

   ### Editing Configurations
  1. Click on the drop down arrow in the upper right corner, then "Edit Configurations".
  2. Click on the green plus "+" sign and select application.
  3. Select the java class with a main function. (This should load automatically)
  4. Name this configuration.
  5. Specify any program arguments in the "Program Arguments" field
      - This replaces passing arguments from the command line.
  6. Click "Apply".
  7. Now you can run your code by clicking the green arrow on top!

## Version Control
   1. On the new project screen, click "Check out from Version Control".
   2. Select which Version Control you want to use (Gitlab = "Git").
   3. Log in. (should only have to do once).
   4. Clone your repository.
  ### Pulling, Pushing, etc.
  The Version Control (VCS) tab  has all your Version control needs! Click on the "Git" submenu, there you can:
   - Create a new branch ("Branches")
   - Add files
   - Commit and Push files (green up arrow)
   - Pull (blue down arrow)
      - You can also do this in the terminal if you're very committed to it.
   ### Adding to gitignore
   - Settings/Preferences
   - Double click "Version Control"
   - Add what you want in the git ignore
      - "Ignore specified file" to ignore specific file
      - "Ignore files under" igonores an entire directory
      - "Ignore all files matching" ignores files matching a pattern
  
  

## Debugging
   Debug mode displays variables and their values and shows updates in real time.
   - Click the space next to the line numbers.
      - A red dot should appear.
      - That's where your code will stop.
   - Click the bug in the top right.
      - Now you're debugging!
   ### Some buttons to know
   - Show execution point scrolls to line the code is at.
   - Step over (F8) goes to the next line in the file.
   - Step into (F7) steps to the next line of execution.
   - Run to cursor (Alt+F9) run code until next break point.
   
   If you only need to focus on a few variables, add them to Watches
   - On the right side side window, click the plus with the glasses
   - Search for a variable

  ## Other things to know:
   - To open a terminal:
      - View | Tool Windows | Terminal
   - The different views:
      - Run/Console: displays what your program outputs
      - Debug: shows variables when debugging
      - TODO: lists any todos listed in code
      - Version Control: shows ignored files
      - Terminal: is the terminal
   - Refactoring:
      - If you change a variable or a function, Refactor changes all instances of that function/variable
      - Up top, click Refactor | Refactor This
      - If you want to just rename something, Rename
      - Type what you want to change it to
