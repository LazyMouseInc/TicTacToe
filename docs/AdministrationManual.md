# Administration Manual
##### Requirements:
  - Git Bash or a similar terminal.
  - The latest version of Java.
  - Internet connection.
  - If you don't have an SSH key, follow these instructions:
https://help.github.com/articles/adding-a-new-ssh-key-to-your-github-account/

##### Setting Up:

  - Go to the following link: https://github.com/LazyMouseInc/TicTacToe
  - Press the “Clone or download” button and then press the “Copy to clipboard” button.
  - Open Git Bash and navigate to the folder in which you want to clone the repository.
  - When you’re in the correct folder use the “git clone” action followed by the code you copied from the GitHub. In this case it would be:
**git clone git@github.com:LazyMouseInc/TicTacToe.git**
  - Once the repo has been cloned to the desired destination, move into it and use the “gradle build” action to build the program.
  - When the program is built you should be able to access a folder called build and within it a folder called libs. In the libs folder there is a java executable file (.jar) called TicTacToe. Move this file to the desktop (or any place outside the TicTacToe repository).
  - In Git Bash, navigate to where you put TicTacToe.jar and use the “java -jar TicTacToe.jar” action to run the program.


