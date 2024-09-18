## **springmvc**
### dispatchServlet 
![img_1.png](img_1.png) 其中handler代表控制器Controller
通过一个中间件dispatchServlet代替了以前servlet的跳转链

### dispatchServletAnnotation 
在使用注解时候，注解代替了在xml中配置，并且也不需要配置处理映射器与处理适配器，
好处在于减少了xml的配置，更好的管理请求与转发。

- WEB-INF是Java的WEB应用的安全目录。所谓安全就是客户端无法访问，只有服务端可以访问的目录。所以会引起404错误。