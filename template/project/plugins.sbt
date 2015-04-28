resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

// The Play plugin
addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.3.8")

// Test Coverage
addSbtPlugin("org.scoverage" %% "sbt-scoverage" % "1.0.4")

// Style Guide
addSbtPlugin("com.typesafe.sbt" % "sbt-scalariform" % "1.3.0")

//scala style
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "0.6.0")
