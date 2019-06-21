package goods.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import goods.dao.GoodsDAO;

@Controller
@RequestMapping(value="/goods")
public class GoodsController {
//	@Autowired
//	private GoodsDAO goodsDAO;
	
	@RequestMapping(value="/goods_list.do", method=RequestMethod.GET)
	public String goods_list(@RequestParam(required=false, defaultValue="1") String category, Model model) {
		int cNum = Integer.parseInt(category);
		String cName = null;
		
		if(cNum==1) cName = "/goods/category_stationery";
		else if(cNum==2) cName = "/goods/category_living";
		else if(cNum==3) cName = "/goods/category_travel";
		else if(cNum==4) cName = "/goods/category_collabo";
		else if(cNum==5) cName = "/goods/category_dc";
		else if(cNum==6) cName = "/goods/category_best";
		
		return cName;
	}
	
}
