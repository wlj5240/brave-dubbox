package com.github.lmg.brave.dubbox.support.defaults;

import com.alibaba.dubbo.rpc.Invoker;
import com.github.lmg.brave.dubbox.support.DubboServerNameProvider;

/**
 * Created by liaomengge on 17/4/13.
 */
public class DefaultServerNameProvider implements DubboServerNameProvider {

    @Override
    public String resolveServerName(Invoker<?> invoker) {
        return invoker.getUrl().getParameter("application");
    }
}