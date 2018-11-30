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

*Note*: in command line it's _sbt "gatling:testOnly computerdatabase.BasicSimulation"_

List all tasks
--------------------

```
> tasks -v gatling
```
