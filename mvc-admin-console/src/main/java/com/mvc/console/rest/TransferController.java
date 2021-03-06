package com.mvc.console.rest;

import com.mvc.common.rest.BaseController;
import com.mvc.console.service.ConfigService;
import com.mvc.console.entity.CoinInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * config controller
 *
 * @author qiyichen
 * @create 2018/1/10 14:07
 */
@Controller
@RequestMapping("transfer")
public class TransferController extends BaseController<ConfigService,CoinInfo> {

}
