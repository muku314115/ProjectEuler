ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "anal_walker"
  )

libraryDependencies ++= Seq(
  "org.scodec" %% "scodec-bits" % "1.1.34",
  "org.scorexfoundation" %% "scrypto" % "2.2.1",
  "org.bitcoinj" % "bitcoinj-core" % "0.16.2",
  "org.bouncycastle" % "bcpg-jdk15on" % "1.70"
)
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "2.0.6",
  "org.slf4j" % "slf4j-simple" % "2.0.6"
)
