# REAMD.md

scalaを学ぶための環境を作る。

## Initial Usage

* sbt-1.3.5.tgzをダウンロードし、`dockerfile/assets/`に配備する
* `make docker-build`を実行する

## Usage

* `docker run -it --rm -v $(pwd)/cache:/root/.ivy2/ -v $(pwd)/workspace/:/root/scala sbt:adoptopenjdk8-alpine`
