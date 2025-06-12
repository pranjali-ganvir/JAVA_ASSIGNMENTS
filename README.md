# JAVA_ASSIGNMENTS

#STEPS

Pranjaly Ganvir@DESKTOP-9CG3S45 MINGW64 ~/Desktop/GitBashLocal (master)
$ git init
Initialized empty Git repository in C:/Users/Pranjaly Ganvir/Desktop/GitBashLocal/.git/

Pranjaly Ganvir@DESKTOP-9CG3S45 MINGW64 ~/Desktop/GitBashLocal (master)
$ git clone https://github.com/pranjali-ganvir/basicjava.git
Cloning into 'basicjava'...
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 3 (delta 0), pack-reused 0 (from 0)
Receiving objects: 100% (3/3), done.

Pranjaly Ganvir@DESKTOP-9CG3S45 MINGW64 ~/Desktop/GitBashLocal (master)
$ ls
basicjava/

Pranjaly Ganvir@DESKTOP-9CG3S45 MINGW64 ~/Desktop/GitBashLocal (master)
$ cd basicjava/

Pranjaly Ganvir@DESKTOP-9CG3S45 MINGW64 ~/Desktop/GitBashLocal/basicjava (main)
$ ls
'My Intro.txt'

Pranjaly Ganvir@DESKTOP-9CG3S45 MINGW64 ~/Desktop/GitBashLocal/basicjava (main)
$ git status
On branch main
Your branch is up to date with 'origin/main'.

Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        deleted:    newfile.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        My Intro.txt

no changes added to commit (use "git add" and/or "git commit -a")

Pranjaly Ganvir@DESKTOP-9CG3S45 MINGW64 ~/Desktop/GitBashLocal/basicjava (main)
$ git add My\ Intro.txt

Pranjaly Ganvir@DESKTOP-9CG3S45 MINGW64 ~/Desktop/GitBashLocal/basicjava (main)
$ git commit -m "intro"
[main c9196b6] intro
 1 file changed, 1 insertion(+)
 create mode 100644 My Intro.txt

Pranjaly Ganvir@DESKTOP-9CG3S45 MINGW64 ~/Desktop/GitBashLocal/basicjava (main)
$ git push --all https://github.com/pranjali-ganvir/basicjava.git
Enumerating objects: 4, done.
Counting objects: 100% (4/4), done.
Delta compression using up to 4 threads
Compressing objects: 100% (2/2), done.
Writing objects: 100% (3/3), 296 bytes | 296.00 KiB/s, done.
Total 3 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
To https://github.com/pranjali-ganvir/basicjava.git
   68a0f1f..c9196b6  main -> main

Pranjaly Ganvir@DESKTOP-9CG3S45 MINGW64 ~/Desktop/GitBashLocal/basicjava (main)
$ git status
On branch main
Your branch is ahead of 'origin/main' by 1 commit.
  (use "git push" to publish your local commits)

Changes not staged for commit:
  (use "git add/rm <file>..." to update what will be committed)
  (use "git restore <file>..." to discard changes in working directory)
        deleted:    newfile.txt

Untracked files:
  (use "git add <file>..." to include in what will be committed)
        AdditionInterface.java
        Assignment100.java
        Assignment101.java
        Assignment102.java
        Assignment103.java
        Assignment104.java
        Assignment105.java
        Assignment106.java
        Assignment54.java
        Assignment55.java
        Assignment56.java
        Assignment57.java
        Assignment58.java
        Assignment59.java
        Assignment59D.java
        Assignment60.java
        Assignment68.java
        Assignment69.java
        Assignment70.java
        Assignment71.java
        Assignment72.java
        Assignment73.java
        Assignment74.java
        Assignment75.java
        Assignment76.java
        Assignment77.java
        Assignment78.java
        Assignment79.java
        Assignment80.java
        Assignment81.java
        Assignment82.java
        Assignment83.java
        Assignment84.java
        Assignment85.java
        Assignment86.java
        Assignment87.java
        Assignment88.java
        Assignment89.java
        Assignment90.java
        Assignment91.java
        Assignment92.java
        Assignment93.java
        Assignment94.java
        Assignment95.java
        Assignment96.java
        Assignment97.java
        Assignment98.java

no changes added to commit (use "git add" and/or "git commit -a")

Pranjaly Ganvir@DESKTOP-9CG3S45 MINGW64 ~/Desktop/GitBashLocal/basicjava (main)
$ git add .

Pranjaly Ganvir@DESKTOP-9CG3S45 MINGW64 ~/Desktop/GitBashLocal/basicjava (main)
$ git commit -m "Basic java program"
[main 8bd3b6b] Basic java program
 47 files changed, 1071 insertions(+)
 create mode 100644 AdditionInterface.java
 create mode 100644 Assignment100.java
 create mode 100644 Assignment101.java
 create mode 100644 Assignment102.java
 create mode 100644 Assignment103.java
 create mode 100644 Assignment104.java
 create mode 100644 Assignment105.java
 create mode 100644 Assignment106.java
 create mode 100644 Assignment54.java
 create mode 100644 Assignment55.java
 create mode 100644 Assignment56.java
 create mode 100644 Assignment57.java
 create mode 100644 Assignment58.java
 create mode 100644 Assignment59.java
 create mode 100644 Assignment59D.java
 create mode 100644 Assignment60.java
 create mode 100644 Assignment68.java
 create mode 100644 Assignment69.java
 create mode 100644 Assignment70.java
 create mode 100644 Assignment71.java
 create mode 100644 Assignment72.java
 create mode 100644 Assignment73.java
 create mode 100644 Assignment74.java
 create mode 100644 Assignment75.java
 create mode 100644 Assignment76.java
 create mode 100644 Assignment77.java
 create mode 100644 Assignment78.java
 create mode 100644 Assignment79.java
 create mode 100644 Assignment80.java
 create mode 100644 Assignment81.java
 create mode 100644 Assignment82.java
 create mode 100644 Assignment83.java
 create mode 100644 Assignment84.java
 create mode 100644 Assignment85.java
 create mode 100644 Assignment86.java
 create mode 100644 Assignment87.java
 create mode 100644 Assignment88.java
 create mode 100644 Assignment89.java
 create mode 100644 Assignment90.java
 create mode 100644 Assignment91.java
 create mode 100644 Assignment92.java
 rename newfile.txt => Assignment93.java (100%)
 create mode 100644 Assignment94.java
 create mode 100644 Assignment95.java
 create mode 100644 Assignment96.java
 create mode 100644 Assignment97.java
 create mode 100644 Assignment98.java

Pranjaly Ganvir@DESKTOP-9CG3S45 MINGW64 ~/Desktop/GitBashLocal/basicjava (main)
$ git push --all https://github.com/pranjali-ganvir/basicjava.git
Enumerating objects: 49, done.
Counting objects: 100% (49/49), done.
Delta compression using up to 4 threads
Compressing objects: 100% (48/48), done.
Writing objects: 100% (48/48), 12.26 KiB | 2.04 MiB/s, done.
Total 48 (delta 8), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (8/8), done.
To https://github.com/pranjali-ganvir/basicjava.git
   c9196b6..8bd3b6b  main -> main

Pranjaly Ganvir@DESKTOP-9CG3S45 MINGW64 ~/Desktop/GitBashLocal/basicjava (main)
$
