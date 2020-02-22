package com.wem.eurekazuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.web.bind.annotation.RequestMapping;

public class MyZuulFilter extends ZuulFilter {

    /**
     * 过滤器的返回类型
     * pre      在请求被路由之前调用
     * routing  在路由请求的同时调用
     * post     routing 和 error 过滤器之后调用
     * error    处理请求发生错误的时候调用
     * @return
     */
    @Override
    public String filterType() {

        return "pre";
    }

    /**
     * 过滤器的执行顺序
     * @return
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 该过滤器是否被执行：true 代表执行，false 代表不执行
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 具体的过滤器逻辑
     * @return
     */
    @Override
    public Object run() {
        /*
        从当前线程中获得 requestContext 对象
        RequestContext currentContext = RequestContext.getCurrentContext();
        System.err.println(currentContext);
        currentContext.setSendZuulResponse(false);
        currentContext.setResponseBody("展示的信息内容");
        currentContext.setResponseStatusCode(500);
         */

        return null;
    }

}
