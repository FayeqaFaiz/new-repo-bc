#### Steps:
>
1. Setup all the required tools
	here we need GITHUB,JENKINS,SLACK

2.Be ready with your project source code. Any document can be taken for example..

    Login to git  ,  start Jenkins , start slack.
	Integrate git-jenkins- slack.

3.Login to github - create a repository (new-repo-bc) -  Upload the code to that repository
   Add 'jenkins github plugin' under repo->settings->webhook&services.
   (we can see the notifications on slack)

4.start the jenkins server - create a job on jenkins(bluecirrus-project).

5.configure the jenkins job - specify the git repo URL - enable slack notifications - Poll SCM - check build  when changes occur on GIT and save it.
	(we can see the notifications on slack)

6.Now build the job 

since we didnt make any changes it shows "no changes" as it was the first buil job 

now let us try to make changes on git

let us create a file named videos3.md

now the changes are saved

let us check the build job now for changes

build again

hence we have integrated tools to build jobs and get notified through slack..

Thank You..!!

See the video here... [video](https://github.com/FayeqaFaiz/new-repo-bc/blob/master/videos3.md)
	

