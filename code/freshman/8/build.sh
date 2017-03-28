#!/bin/sh
if [ ! -d "dist" ]; then
    mkdir dist
fi
eclipse(){
    ln -s ide/eclipse/project .project
    ln -s ide/eclipse/classpath .classpath
}
idea(){
    ehco "idea"
}
help(){
    echo $"Usage:$0 {eclipse | idea | help}"
    exit 1
}
case "$1" in
eclipse)
    eclipse
    ;;
idea)
    idea
    ;;
-h|help|h|H|-H)
    help
    ;;
*)
    help
    ;;
esac


