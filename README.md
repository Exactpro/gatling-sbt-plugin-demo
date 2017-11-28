Gatling's SBT plugin demo
=========================

Configure and use [gatling-sbt plugin](https://github.com/gatling/gatling-sbt) to run Gatling simulations.

This project uses SBT 1.0.4, which is available [here](http://www.scala-sbt.org/download.html).

Get the project
---------------

```bash
git clone https://github.com/gatling/gatling-sbt-plugin-demo.git _my-dir_ && cd _my-dir_
```

Start SBT
---------
```bash
$ sbt
```

Run all simulations
-------------------

```bash
> gatling:test
```

Run a single simulation
-----------------------

```bash
> gatling:testOnly computerdatabase.BasicSimulation
```

List all tasks
--------------------

```bash
> tasks -v gatling
```
