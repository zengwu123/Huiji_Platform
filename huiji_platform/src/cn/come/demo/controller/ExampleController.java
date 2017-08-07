package cn.come.demo.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @Title: <p> ExampleController.java <p>
* @Description: <p> 类说�? <p>
* @author    尚勇�?
* @version   1.0 
* @date      2016�?11�?10�? 下午10:38:26
* @Company: <p> 慧极科技  </p>
 */
@Controller
@RequestMapping(value="/example")
public class ExampleController {
	   private static final Log logger = LogFactory.getLog(ExampleController.class);

	    @RequestMapping(value = "/error403")
	    public String error403(){
	        logger.info("ExampleController called!");
	        return "example.error403";
	    }
	    @RequestMapping(value = "/error404")
	    public String error404(){
	        logger.info("ExampleController called!");
	        return "example.error404";
	    }
	    @RequestMapping(value = "/error405")
	    public String error405(){
	        logger.info("ExampleController called!");
	        return "example.error405";
	    }
	    @RequestMapping(value = "/error500")
	    public String error500(){
	        logger.info("ExampleController called!");
	        return "example.error500";
	    }
	    
	    @RequestMapping(value = "/table")
	    public String table(){
	        logger.info("ExampleController called!");
	        return "example.table";
	    }
	    @RequestMapping(value = "/button_and_icons")
	    public String button_and_icons(){
	        logger.info("ExampleController called!");
	        return "example.button_and_icons";
	    }
	    @RequestMapping(value = "/gallery")
	    public String gallery(){
	        logger.info("ExampleController called!");
	        return "example.gallery";
	    }
	    @RequestMapping(value = "form_common")
	    public String form_common(){
	        logger.info("ExampleController called!");
	        return "example.form_common";
	    }
	    @RequestMapping(value = "/form_validation")
	    public String form_validation(){
	        logger.info("ExampleController called!");
	        return "example.form_validation";
	    }
	    @RequestMapping(value = "/form_wizard")
	    public String form_wizard(){
	        logger.info("ExampleController called!");
	        return "example.form_wizard";
	    }
	    @RequestMapping(value = "/gridlayout")
	    public String gridlayout(){
	        logger.info("ExampleController called!");
	        return "example.gridlayout";
	    }
	    @RequestMapping(value = "/index_info")
	    public String index_info(){
	        logger.info("ExampleController called!");
	        return "example.index_info";
	    }
	    @RequestMapping(value = "/interface_elements")
	    public String interface_elements(){
	        logger.info("ExampleController called!");
	        return "example.interface_elements";
	    }
}
