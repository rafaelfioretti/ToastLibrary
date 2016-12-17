package br.com.rafaelfioretti.toastlibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by rafaelfioretti on 12/17/16.
 */

public class CustomToast {

    public void exibirMensagem(Context t, String mensagem){

        Toast.makeText(t, mensagem, Toast.LENGTH_SHORT).show();
    }

}
