This is a readme file. This is my very first repo. 

git config --global user.email "your email"

git config --global user.name "your name"


git-first-task
add all the change in your directory to git:
git add .

commit your changes with proper message
save a snapshot of the changes in the staging area with a discriptive message:
git commit -m ""

pushing your change into remote branch and remove:
git push origin [branch]

it will show the status of the current repository including the file have been modified and need to be commited:
git status

logs:
git log

In professional scenerio:

three type of scenario

production -> main() UAT() -> uat develop -> develop()


-> git flow

#inorder to see how many branches you have in your local system:
git branch

#create a branch name uat:
git checkout -b uat

#it will take changes from your source branch into the target branch git merge

Trying to Merge.