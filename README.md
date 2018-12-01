Gatling's SBT plugin demo
=========================

Configure and use [gatling-sbt plugin](https://github.com/gatling/gatling-sbt) to run Gatling simulations.

This project uses SBT 1, which is available [here](https://www.scala-sbt.org/download.html).

Get the project
---------------

```bash
git clone https://github.com/gatling/gatling-sbt-plugin-demo.git $dir && cd $dir
```

Start SBT
---------
```bash
$ sbt
```

Run all simulations
-------------------

```
> gatling:test
```

Run a single simulation
-----------------------

```
> gatling:testOnly computerdatabase.BasicSimulation
```

**Note**: in command line it's
```
$ sbt "gatling:testOnly computerdatabase.BasicSimulation"
```

List all tasks
--------------------

```
> tasks -v gatling
```

Why this fork?
==============

In a few words: to run 3.0.x-SNAPSHOT, now it can only do RELEASE, which makes it [redundant](https://github.com/gatling/gatling-maven-plugin-demo).

In November 2017 I wanted to ensure my scenarios were compatible with [Gatling 3 API](gatling/gatling#3071) which was to appear in 3.0.0-SNAPSHOT.
Additionally I got used to developing and running scenarios with IDEA and for that I'd used maven-plugin-demo per Gatling
[instruction](https://gatling.io/docs/current/extensions/maven_archetype/).
Without success I had tried to modify pom.xml to add Sonatype OSS repo.

Probably at the same time I'd found gatling-sbt-plugin-demo and found it [malleable](a5df8bef1) to IDE-centered development support.
It turned out it was easy to convince SBT to use 3.0.0-SNAPSHOT too, and in Nov. 28 this repo was published and
[announced](https://groups.google.com/forum/#!topic/gatling/6DwwJ9kfLGs).

Unfortunately it went unnoticed [until 2018.01.02](gatling/gatling/#3406) that since Nov. 17, 2017 io.gatling.highcharts:gatling-charts-highcharts was not updating.
I've re-targeted build.sbt to depend on 3.0.1 release and may reconsider SNAPSHOT later.
