package com.dreaming.design.solve;

import com.dreaming.design.business.ExportFileApi;
import com.dreaming.design.solve.creator.ExportDBOperate;
import com.dreaming.design.solve.creator.ExportTxtFile0perate;

public class ExportFileFactory {
    static ExportFileApi createFileCreator(ExportType type){
        switch (type){
            case File -> new ExportTxtFile0perate();
            case DB   -> new ExportDBOperate();
        }
        return null;
    }
}
