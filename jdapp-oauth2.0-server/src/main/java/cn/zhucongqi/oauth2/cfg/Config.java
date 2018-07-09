/**
 * JFinal 的配置信息
 */
package cn.zhucongqi.oauth2.cfg;

import com.jfinal.config.Constants;
import com.jfinal.config.Handlers;
import com.jfinal.config.Interceptors;
import com.jfinal.config.Plugins;
import com.jfinal.config.Routes;
import com.jfinal.ext.config.JFinalConfigExt;
import com.jfinal.template.Engine;

import cn.zhucongqi.oauth2.data.DataKit;

/**
 * 
 * @author Jobsz [zcq@zhucongqi.cn]
 * @version
 */
public class Config extends JFinalConfigExt {
	
	public void afterJFinalStarted(){
		//初始化数据
		DataKit.init();
	}

	@Override
	public void configMoreConstants(Constants me) {
		
	}

	@Override
	public void configMoreRoutes(Routes me) {

	}

	@Override
	public void configMorePlugins(Plugins me) {
	}

	@Override
	public void configMoreInterceptors(Interceptors me) {

	}

	@Override
	public void configMoreHandlers(Handlers me) {
		
	}

	@Override
	public void configEngineMore(Engine me) {
		
	}
}
