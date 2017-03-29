#!/bin/sh
#功能：自动在当前文件夹下的每一个子目录生成一个文件
#
#
folds=`ls -lR | grep -i :$ | sed 's/.$//'`
help()
{
    echo "USAGE: $0 filename "
    echo " e.g.: $0 README.md"
    exit 1;
}
create_file()
{
    ret="n"
    while [ true ]
    do
        read -p "Are you sure you want to create files in all folders?(y/n)" ret
        if [ "$ret" == "n" ]; then
            exit 1
        fi
        if [ "$ret" == "y" ]; then
            break;
         else
             echo "Your input is incorrect"
        fi
    done
    for fold in ${folds}
    do
        filename=$fold"/"$1
        if [ ! -f $filename ]; then
            echo $filename
            touch $filename
        fi
    done
}
delete_file()
{
    ret="n"
    while [ true ]
    do
        read -p "Are you sure you want to delete files in all folders?(y/n)" ret
        if [ "$ret" == "n" ]; then
            exit 1
        fi
        if [ "$ret" == "y" ]; then
            break;
         else
             echo "Your input is incorrect"
        fi
    done
    for fold in ${folds}
    do
        filename=$fold"/"$1
        echo $filename
        if [  -f $filename ]; then
            rm -f $filename
        else
            echo "error $filename is not exist"

        fi
    done

}
if [ $# != 2 ] ; then
    help
fi
case "$1" in
    create)
        create_file $2
        ;;
    delete)
        delete_file $2
        ;;
    -h|help|H|-H)
        help
        ;;
     *)
         help
         ;;
 esac
#create_file $1
