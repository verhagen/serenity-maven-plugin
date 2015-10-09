# Serenity Maven Plug-in


## Overview

The available goals of the Serenity Maven Plug-in are:

| Goal Name   | Description |
| ----------- | ----------- |
| `import`    | Converts external (e.g. xUnit) files into Serenity reports. |
| `aggregate` | Generates aggregated XML acceptance test reports. |
| `check`     | Checks the Serenity test results, for Errors and Failures. |


## Usage

The example below shows the usage of the aggregate goal. Make sure the required version numbers are updated.

| Groups Id | Artifact Id | Version |
| --------- | ----------- | ------- |
| `net.serenity-bdd` | `serenity-core`     | [![net.serenity-bdd/serenity-core](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-core/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd/serenity-core)             |
| `net.serenity-bdd.maven.plugins` | `serenity-maven-plugin`  | [![net.serenity-bdd/serenity-core](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd.maven.plugins/serenity-maven-plugin/badge.svg)](https://maven-badges.herokuapp.com/maven-central/net.serenity-bdd.maven.plugins/serenity-maven-plugin)  |

	<properties>
		<serenity-core.version>#####</serenity-core.version>
		<serenity-maven-plugin.version>#####</serenity-maven-plugin.version>
	</properties>
	
    <plugin>
        <groupId>net.serenity-bdd.maven.plugins</groupId>
        <artifactId>serenity-maven-plugin</artifactId>
        <version>${serenity-maven-plugin.version}</version>
        <dependencies>
          <dependency>
            <groupId>net.serenity-bdd</groupId>
            <artifactId>serenity-core</artifactId>
            <version>${serenity-core.version}</version>
          </dependency>
        </dependencies>
        <executions>
            <execution>
                <id>serenity-reports</id>
                <phase>post-integration-test</phase>
                <goals>
                    <goal>aggregate</goal>
                </goals>
            </execution>
        </executions>
    </plugin>


## Developers

The Serenity Maven Plug-in can only be build after the [Serenity (Core) libraries](https://github.com/serenity-bdd/serenity-core) are present in the (local) Maven repository.