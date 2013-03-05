package com.chen;

import org.nutz.mvc.annotation.Fail;
import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.annotation.Ok;

@Modules(scanPackage = true)
@Ok("json")
@Fail("json")
public class MainModule {

}
