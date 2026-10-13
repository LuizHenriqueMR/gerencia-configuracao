#!/usr/bin/env sh
set -eu
cd "$(dirname "$0")"
mvn clean verify javadoc:javadoc
