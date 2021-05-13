set Axis_Lib=D:\ideaproject\mygit\taurus-wsdl\lib
set Java_Cmd=Java -Djava.ext.dirs=%Axis_Lib%  
set Axis_Servlet=http://120.195.111.134:9090/services/cmcc_mas_wbs?wsdl
%Java_Cmd% org.apache.axis.wsdl.WSDL2Java -u %Axis_Servlet%