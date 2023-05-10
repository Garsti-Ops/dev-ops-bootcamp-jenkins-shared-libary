#!/usr/bin/env groovy

def call() {
    echo "building the app"
    sh 'mvn package'
}