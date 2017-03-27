package com.hitler.web.controller.back;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hitler.core.web.controller.GenericController;
import com.hitler.play.worker.JobType;
import com.hitler.service.sider.IHeroService;

@Controller
@RequestMapping("back/")
public class PingController extends GenericController {

	@Resource
	private IHeroService heroService;

	@RequestMapping("/game/{com}")
	@ResponseBody
	public boolean makeLN(@PathVariable String com) throws Exception {
		if ("MKLN".equals(com)) {
			heroService.comm(JobType.MAKE_LN);
		}
		if ("LTSHD".equals(com)) {
			heroService.comm(JobType.LT);
		}
		return false;
	}

}
