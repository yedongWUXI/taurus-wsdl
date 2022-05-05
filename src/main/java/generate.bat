set Axis_Lib=D:\ideaproject\mygit\taurus-wsdl\lib
set Java_Cmd=Java -Djava.ext.dirs=%Axis_Lib%  
set Axis_Servlet=http://localhost:1001/webservice/api?wsdl
%Java_Cmd% org.apache.axis.wsdl.WSDL2Java -u %Axis_Servlet%