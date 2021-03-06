[![logo](https://playframework.com/assets/images/logos/play_full_color.png)](http://www.playframework.com/)

# OpenShift Play Framework Cartridge

Works with Play 2.3 and Activator : http://www.playframework.com/

## Use it

Note : now works with small OpenShift gears, the build script will use no more than 512MB by default.

### From the web site

In OpenShift, choose a downloaded cartridge, with the following URL : http://cartreflect-claytondev.rhcloud.com/reflect?github=pat2man/openshift-cartridge-play2

Note that it takes about 5 minutes to create the application since it will download the activator from typesafe and the initial build of the sample application takes a few minutes, depending on the load of the server.

### command line (rhc)

```rhc app create playtest http://cartreflect-claytondev.rhcloud.com/github/arielscarpinelli/openshift-cartridge-play2 --no-git -s```


### binary deploy 
If you prefer to upload a complete build instead of building in server, deploy your app take a look at this deploy script:

https://gist.github.com/pat2man/870f3ae1c86f0b11f300


## Local start

You need to have installed [Play](http://www.playframework.com/) on your development workstation.

Simply launch ```activator run``` from your invite, and browse to http://localhost:9000/ to see the welcome page.
