#KotlinExtensionsAndroid

A simple repo containing some Android specific extension methods.
These extension methods are not meant to save the world, but to make your code more compact and to make it easier to read.

##Usage
To use this these set of extension methods in your project, first, you need to clone this repository and then locally build it with `./gradlew install`.

Once you are done with it, you can declare it as a dependency.

Maven:
```xml
<dependency>
  <groupId>com.github.pjozsef</groupId>
  <artifactId>kotlin-extensions-android</artifactId>
  <version>0.0.1</version>
  <type>aar</type>
</dependency>
```

Gradle:
```groovy
compile 'com.github.pjozsef:kotlin-extensions-android:0.0.1@aar'
```
##Features
To see how these extension methods could help you, take a look at the  [Demo.kt](https://github.com/pjozsef/KotlinExtensionsAndroid/blob/master/demo/src/main/kotlin/com/github/pjozsef/demo/Demo.kt) file.
