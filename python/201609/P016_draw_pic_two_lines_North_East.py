# coding=utf-8

import string
import matplotlib.pyplot as pl  
import numpy as np
 
if __name__ == '__main__':    
    file = open("/home/zxwtry/data/上河GIC_武汉地磁台06121413_09271631_E_x_North.csv", 'r')
    line = file.readline()
    list_str = line.split(",")
    print len(list_str)
    file = open("/home/zxwtry/data/上河GIC_武汉地磁台06121413_09271631_E_y_East.csv", 'r')
    line2 = file.readline()
    list_str2 = line2.split(",")
    f_arr2 = []
    for str_now2 in list_str2:
        f_arr2.append(-float(str_now2))
    f_arr = []
    for str_now in list_str:
    	f_arr.append(float(str_now))
    x_arr = range(len(list_str))
    pl.plot(x_arr, f_arr, 'k')
    pl.plot(x_arr, f_arr2, 'r')
    pl.show()
