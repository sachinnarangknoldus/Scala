Read Me

Scaladevil (I have not included the target folder which contains the native image on the location below & for universal pacakage i have created a release)
Here is the link of complete code : - 

A simple client server application. The client would send requests based on the data contained in the flags to the server using Unix Domain Socket. The Server after processing the request will send the reply back to be shown by the cli. 

This is a command line parser written in Scala.Its a multimodule project Which takes name of the user and some flags with it and prints according to the flag used.I have used flag driven approach so you pass any flag any time.But if you will pass more than 2 flags such as "-s" "-a" it will use the updated one.If the flag used is valid one it will print the output otherwise it will catch the exception and terminate the program.

If you wanna see the types of flags used you can use "--help" flag.

To package the application I have used the sbt-native-packager (universal plugin). It creates a distribution that is not tied to any particular platform.

Plugins Used :
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.6")   //For assemby
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.6.1") //For sbt native packager

Enabled plugins:
enablePlugins(UniversalPlugin)
enablePlugins(JavaAppPackaging, GraalVMNativeImagePlugin) # For GraalVm Native image


Create a .zip file (Which contains bin folder and in that you have the script file to run):
modulename/universal:packageBin  
#visit here(Scaladevil/cliParser/target/universal/cliparser-0.1.0-SNAPSHOT) 

**To run the application **:
./applicationname name_to_be_printed -flag   //Incase if you donot pass and flag by default it will use "$"
 
**Available flags :
	     -s	: return $ for printing
	     -a	: return @ for printing
	     -k	: return * for printing
	     -i	: return ! for printing
   --help : prints all flags with there return type**
   
       
_**For GraalVm native-image:(Go to this location)
Scaladevil/cliParser/target/scala-2.12/cliParser-assembly-0.1.0-SNAPSHOT**_
