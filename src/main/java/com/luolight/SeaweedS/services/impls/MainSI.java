package com.luolight.SeaweedS.services.impls;

import com.luolight.SeaweedS.models.SsModule;
import com.luolight.SeaweedS.models.SsUser;
import com.luolight.SeaweedS.services.MainS;
import com.luolight.SeaweedS.utils.BaseUtil;
import com.luolight.SeaweedS.utils.Constans;
import com.luolight.SeaweedS.utils.HtmlRequest;
import com.luolight.SeaweedS.utils.U;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

@Service
public class MainSI implements MainS {

    @Autowired
    private SsModuleSI moduleSI;

    @Autowired
    private SsUserSI ssUserSI;

    @Override
    public HashMap<String, Object> getCheckUrl(String url) {
        String host = U.urlToHost(url);
        SsModule ssEntity = moduleSI.selectByUrlHost(host);
        if(null == ssEntity) {
            SsModule module = new SsModule();
            module.setUrlHost(host);
            module.setIsDelete((short) 0);
            module.setUrl(url);
            module.setIsNeed((short) 0);
            module.setName(U.getUrlHost(url));
            module.setTime(new Date());
            moduleSI.insert(module);
            return Constans.returnCon(module, "21", null);
        }else {
            return Constans.returnCon(ssEntity, "22", null);
        }
    }

    @Override
    public HashMap<String, Object> productHtml(String url) throws IOException {
        //通过url生成指定html
        String fileName = HtmlRequest.filePre + HtmlRequest.getStringRandom(12) + ".html";
        HtmlRequest.htmlGet(url, fileName, HtmlRequest.seaweedSister);
        return Constans.returnCon(fileName, "31", null);
    }

    @Override
    public HashMap<String, Object> register(SsUser ssUser) {
        ssUser.setType((short) 2);
        ssUser.setCreateTime(new Date());
        ssUserSI.insertSelective(ssUser);
        return null;
    }

    @Override
    public HashMap<String, Object> login(SsUser ssUser) {
        SsUser user = ssUserSI.selectByUsername(ssUser.getUsern());
        if(null == user) {
            return Constans.returnCon(null, "11", null);
        }else {
            String password = BaseUtil.getFromBase64(ssUser.getPassw());
            if(password.equals(user.getPassw())) {
                return Constans.returnCon(null, "12", null);
            }else {
                return Constans.returnCon(null, "13", null);
            }
        }
    }

    @Override
    public HashMap<String, Object> perfectInfo(SsUser ssUser) {
        ssUserSI.updateByPrimaryKeySelective(ssUser);
        return null;
    }


}
