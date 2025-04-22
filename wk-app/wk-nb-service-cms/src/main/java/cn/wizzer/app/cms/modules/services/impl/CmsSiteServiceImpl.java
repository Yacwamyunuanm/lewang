package cn.wizzer.app.cms.modules.services.impl;

import cn.wizzer.framework.base.service.BaseServiceImpl;
import cn.wizzer.app.cms.modules.models.Cms_site;
import cn.wizzer.app.cms.modules.services.CmsSiteService;
import com.alibaba.dubbo.config.annotation.Service;
import org.nutz.dao.Dao;
import org.nutz.ioc.loader.annotation.IocBean;

@IocBean(args = {"refer:dao"})
@Service(interfaceClass=CmsSiteService.class)
public class CmsSiteServiceImpl extends BaseServiceImpl<Cms_site> implements CmsSiteService {
    public CmsSiteServiceImpl(Dao dao) {
        super(dao);
    }
}
