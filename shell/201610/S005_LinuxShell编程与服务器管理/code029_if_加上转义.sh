#!/bin/bash

str='abc 123 987 what u want.'
if [[ "$str" == *[.?\!] ]];then
    echo "变量str是一个字符串，最后一个字符是'.'、'?'或'!'其中一个字符"
fi
#执行结果如下：
#输出：变量str是一个字符串，最后一个字符是'.'、'?'或'!'其中一个字符
#其中\!是对符号!使用转义的意思。
