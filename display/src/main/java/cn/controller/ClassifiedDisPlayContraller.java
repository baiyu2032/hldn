package cn.controller;

import cn.service.ClassifiedDisplayService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
@RequestMapping("display/")
@Controller
@Api(value = "页面展示",description = "具体描述")
public class ClassifiedDisPlayContraller {
    @Autowired
    private ClassifiedDisplayService cds;
    public ClassifiedDisplayService getCds() { return this.cds; }
    public void setCds(ClassifiedDisplayService cds) {
        this.cds = cds;
    }

    @ResponseBody
    @ApiOperation(value="获得品牌种类",httpMethod="POST",notes="返回具体品牌json数组")
    @RequestMapping(value = "getbrand")
    public String brand(){
        return cds.getbrand();
    }
    @ResponseBody
    @RequestMapping(value = "showcom")
    @ApiOperation(value="按照ID查询相应商品",httpMethod="POST",notes="返回商品对象的json数据")
    public String showcom(@ApiParam(name = "id", value = "商品ID", required = true)int id){
        return cds.computerShow(id);
    }

    @ResponseBody
    @RequestMapping(value = "findbyname" ,produces = "application/json;charset=utf-8",method = RequestMethod.GET)
    @ApiOperation(value="模糊查询",httpMethod="GET",notes="返回查到的商品信息json数组")
    public String findByComname(@ApiParam(name = "s", value = "需要查询的商品信息", required = true)String s){
//        SensitiveWordFilterConfig swfc=new SensitiveWordFilterConfig();
//        String s1 = swfc.filterInfo(s);
        return cds.findByComname(s);
    }
    @ResponseBody
    @RequestMapping(value = "getallbrand")
    @ApiOperation(value="查询所有品牌种类",httpMethod="POST",notes="返回所有品种json数组")
    public String getallbrand(){
        return cds.getallbrand();
    }


    @RequestMapping("getgoodsbyid")
    @ResponseBody
    @ApiOperation(value = "根据ID查询相应商品",httpMethod = "POST",notes = "返回相应商品对象")
    public String getgoodsbyid(@ApiParam(name = "gid", value = "商品ID", required = true) @RequestParam("gid")int gid){
        return cds.getgoodsbyid(gid);
    }

    @ResponseBody
    @RequestMapping("getallgoods")
    @ApiOperation(value = "分页查询所有商品" , httpMethod = "POST", notes = "返回所有商品json数组")
    public String getallgoods(@ApiParam(name = "pagenum", value = "页数", required = true) @RequestParam("pagenum")int pagenum,@ApiParam(name = "pagesize", value = "每页显示数量", required = true) @RequestParam("pagesize")int pagesize) throws Exception {
        String getallgoods = cds.getallgoods(pagenum, pagesize);
        return getallgoods;
    }
}
