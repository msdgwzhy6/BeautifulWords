package com.chenyuan.sentence.mvp.ui.view;

import com.chenyuan.sentence.mvp.model.entity.SentenceImageText;

import java.util.List;

/**
 * 美图美句
 */
public interface IMeituMeijuView {

    void onSuccess(List<SentenceImageText> sentenceImageTexts);

    void onError(Throwable e);
}