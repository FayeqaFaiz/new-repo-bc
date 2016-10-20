##Tool Chain Information:

* **Github-Jenkins_Slack**
 * Github is integrated with jenkins
    * Add jenkins github plugin and ssh configuration on github .
    * specify the clone URL of github repository on jenkins.
    
 * Github and jenkins are then integrated with Slack.
 
 **Steps:**
 
 * The Project source code is uploaded on GITHUB - Repository name: [new-repo-bc](https://github.com/FayeqaFaiz/new-repo-bc).
    * Like here we have uploaded Db-bluecirrus etc..
   >
    [![Screenshot from 2016-10-20 14-00-42.png](https://s18.postimg.org/tl2d3mt3d/Screenshot_from_2016_10_20_14_00_42.png)](https://postimg.org/image/g45ekrirp/)
 
 * The notification of this will appear on Slack.
 
 [![Screenshot from 2016-10-20 14-03-01.png](https://s17.postimg.org/toz2wnfzz/Screenshot_from_2016_10_20_14_03_01.png)](https://postimg.org/image/709vx2ym3/)
 
 * This repository is configured with jenkins github plugin service and webhook.
 * Jenkins server is started and a job is created...
 * This job is configured with the github repo clone url.
 
 * We need to also enable Slack notification on this job.
 
  [![Screenshot from 2016-10-20 14-05-44.png](https://s10.postimg.org/ndnpu4h2x/Screenshot_from_2016_10_20_14_05_44.png)](https://postimg.org/image/rmsfwakc5/)
  
 * we have to also configure polling and check "build when a change is pushed on github"
 * As and when any file or any modification of files/code takes place on github ..A build is scheduled on jenkins and the build happens .
 
 * The build can either fai;l or it can be a success..
 
  [![Screenshot from 2016-10-20 14-10-03.png](https://s16.postimg.org/xstvxdzs5/Screenshot_from_2016_10_20_14_10_03.png)](https://postimg.org/image/fd9ezzlnl/)
  
 * The notification of this flow will be notified to all team members on slack.
      * If there are no changes made on git - a notification on slack wil show "No changes"...
      
  [![Screenshot from 2016-10-20 14-11-57.png](https://s9.postimg.org/7rbm8dh73/Screenshot_from_2016_10_20_14_11_57.png)](https://postimg.org/image/bnoy4d26j/)
  
      * If there are changes made on git (like here i have added a file named "Toolchain") then on slack it will show What changes are made.
      
      [![Screenshot from 2016-10-20 14-14-49.png](https://s14.postimg.org/otc4hbx69/Screenshot_from_2016_10_20_14_14_49.png)](https://postimg.org/image/dtqx5q6r1/)
 
 
