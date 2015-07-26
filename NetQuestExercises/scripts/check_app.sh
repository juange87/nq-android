#!/bin/bash
set -ev
./gradlew assemblePreDebug
./gradlew testPreDebug

