// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.6.11")

// Play enhancer - this automatically generates getters/setters for public fields
// and rewrites accessors of these fields to use the getters/setters. Remove this
// plugin if you prefer not to have this feature, or disable on a per project
// basis using disablePlugins(PlayEnhancer) in your build.sbt
addSbtPlugin("com.typesafe.sbt" % "sbt-play-enhancer" % "1.2.2")

// Eclipse plugin
addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "5.2.2")

// JaCoCo plugin
<<<<<<< HEAD
addSbtPlugin("com.github.sbt" % "sbt-jacoco" % "3.0.3")
=======
addSbtPlugin("com.github.sbt" % "sbt-jacoco" % "3.0.3")
>>>>>>> b44ed149200f75f0cc82a71cb45593e32693e961
