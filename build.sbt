name := "json-elastic-streaming"

version := "1.0"

scalaVersion := "2.10.5"

val sparkVersion = "1.4.1"

libraryDependencies ++= Seq(
  "org.apache.spark" % "spark-core_2.10" % sparkVersion % "provided",
  "org.apache.spark" % "spark-streaming_2.10" % sparkVersion % "provided",
  "com.typesafe" % "config" % "1.2.1",
  "org.elasticsearch" % "elasticsearch-spark_2.10" % "2.1.0"
    exclude("commons-beanutils", "commons-beanutils-core")
    exclude("commons-collections", "commons-collections")
    exclude("commons-logging", "commons-logging")
    exclude("com.esotericsoftware.minlog", "minlog")
    exclude("com.google.guava", "guava")
    exclude("org.apache.hadoop", "hadoop-yarn-common")
    exclude("org.apache.hadoop", "hadoop-yarn-api")
    exclude("org.apache.spark", "spark-network-common_2.10")
    exclude("org.spark-project.spark", "unused"),

  "io.spray" %%  "spray-json" % "1.3.2"
)
