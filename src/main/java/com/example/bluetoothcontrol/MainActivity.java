package com.example.bluetoothcontrol;

import android.Manifest;
import android.annotation.SuppressLint;
import android.bluetooth.BluetoothHeadset;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    BluetoothHeadset bluetoothHeadset;
    public static final int telaprincipal = 1;
    // Get the default adapter
    TextView tvDevice;
    TextView status;
    ConexaoThread connect;
    ImageButton imgBtnControl;
   Button btnConexaoRapida;
    private Toolbar mTopoToolbar;
    ImageView iVMainStatusConection;
    ImageButton iBLayPerson;
    private ImageButton btnTerminal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDevice = (TextView) findViewById(R.id.tVDevice);
        status = (TextView) findViewById(R.id.tVStatus);
        btnConexaoRapida = (Button) findViewById(R.id.btnConexaoRapida);
        imgBtnControl = (ImageButton) findViewById(R.id.imgBtnControl);
        iVMainStatusConection = (ImageView) findViewById(R.id.iVMainStatusConection);
        iBLayPerson = (ImageButton) findViewById(R.id.iBLayPerson);
        btnTerminal = (ImageButton) findViewById(R.id.btnTerminal);

        btnTerminal.setOnClickListener(v->
        {
            if(connect.getestaRodando()) {
                Intent terminal = new Intent(this, Terminal.class);
                startActivity(terminal);
            }
        });

        iBLayPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(getBaseContext(), TelaEscolhaLayoutsPersonalizados.class);
               //Intent intent = new Intent(getBaseContext(), TelaPersonalizada.class);

                startActivity(intent);

            }
        });




        mTopoToolbar = (Toolbar) findViewById(R.id.inc_topo_toolbar);


      mTopoToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
           @Override
           public boolean onMenuItemClick(MenuItem menuItem) {
              // Intent it = null;

               switch (menuItem.getItemId()){
                   case R.id.action_conection:

                       Intent iten = new Intent(getBaseContext(), SegundaActivity.class);
                       startActivity(iten);

                       break;

                   case R.id.action_configs:



                       break;

                   case R.id.action_sair:

                       if (connect.getestaRodando()) {
                           connect.cancel();
                       }


                       finish();

                       break;

               }
               //startActivity(it);

               return true;
           }
       });

       mTopoToolbar.inflateMenu(R.menu.menu_topo_toolbar);




    }

    public void conexaoRapida(View view)
    {
        if(btnConexaoRapida.getText().equals("Conectar")) {
            ConexaoRapida conectar = new ConexaoRapida(this);
            connect = conectar.procuraConexao();
        }else if(btnConexaoRapida.getText().equals("Desconectar"))
        {
            if(connect.getestaRodando())
            {
                connect.cancel();
                if(!connect.getestaRodando())
                {
                    status.setText("");
                    tvDevice.setText("Sem Conexão");
                    iVMainStatusConection.setImageResource(R.drawable.icondesconectado);
                    btnConexaoRapida.setText("Conectar");
                }
            }
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected  void onResume() {
        super.onResume();
        connect = new ConexaoThread();
        connect = ((BaseAplicacao)this.getApplicationContext()).getConnect();
        Log.i("Ciclo", "O resume foi chamado");
        Log.i("Ciclo", "O estado e : "+connect.getestaRodando());
        if (connect.getestaRodando()) {
            tvDevice.setText(connect.qualDispositivo());
            status.setText(("Conectado"));
            btnConexaoRapida.setText("Desconectar");
            iVMainStatusConection.setImageResource(R.drawable.iconconectado);

        }
        else
        {
            tvDevice.setText("");
            status.setText("Sem Conexão");
            iVMainStatusConection.setImageResource(R.drawable.icondesconectado);
        }

        permissoes();
        ManipularArquivos manipularArquivos = new ManipularArquivos(this);

   //Veririca se os diretorios que o app usara, existem


    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.i("Ciclo", "O pause foi chamado");

    }
    @Override
    protected void onStop() {

        super.onStop();
        Log.i("Ciclo", "O stop foi chamado");

    }

    @Override
    public void onDestroy() {

        super.onDestroy();
        connect.cancel();
        finish();


    }

public void permissoes()
{
    if(checkSelfPermission(Manifest.permission.READ_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED)
    {
        //permissao garantida
    }
    else
    {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE},3);
    }

    if(checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) == PackageManager.PERMISSION_GRANTED)
    {
        //permissao garantida
    }
    else
    {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},2);
    }



}




    public void telaControle(View view)
    {
        AlertDialog alerta;
        LayoutInflater li = getLayoutInflater();
        View v = li.inflate(R.layout.escolha_layout_controle, null);
        v.findViewById(R.id.iBEscolhaBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(connect.getestaRodando()){

                    Intent itent = new Intent(getBaseContext(), TelaControle.class);
                    startActivity(itent);

                }
                else{
                    Toast.makeText(getBaseContext(), "Não há Conexão ativa", Toast.LENGTH_SHORT).show();;
                }

            }
        });

        v.findViewById(R.id.iBEscolhaJoy).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(connect.getestaRodando()){

                    Intent itent = new Intent(getBaseContext(), TelaControleJoy.class);
                    startActivity(itent);

                }
                else{
                    Toast.makeText(getBaseContext(), "Não há Conexão ativa", Toast.LENGTH_SHORT).show();;
                }

            }
        });

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("");
        builder.setView(v);
        alerta = builder.create();
        alerta.show();
       // alerta.getWindow().setLayout(600, 500);



    }



    @SuppressLint("HandlerLeak")
    public Handler handler = new Handler() {

        @Override
        public void handleMessage(Message msg) {

            Bundle bundle = msg.getData();
            byte[] data = bundle.getByteArray("data");
            String dataString= new String(data);

            if(dataString.equals("---N"))
            {
                status.setText(("Erro ao Conectar"));
                tvDevice.setText("");
                iVMainStatusConection.setImageResource(R.drawable.icondesconectado);

            }
            //   statusMessage.setText("Ocorreu um erro durante a conexão D:");
            else if(dataString.equals("---S"))
            {
                status.setText(("Conectado"));

            }
            else if(dataString.equals("---C"))
            {
                status.setText(("SocketClienteC"));

            }
            else if(dataString.equals("--CS"))
            {
                status.setText(("SocketClienteCC"));
            }
            else if(dataString.equals("--CN"))
            {
                status.setText(("Falha de Conexao"));
            }
            else if(dataString.equals("--CO"))
            {
                status.setText(("Sucesso na Conexao"));
                       mandaConexao();

                    tvDevice.setText(connect.qualDispositivo());
                    status.setText(("Conectado"));
                    btnConexaoRapida.setText("Desconectar");
                    iVMainStatusConection.setImageResource(R.drawable.iconconectado);


            }
            else if(dataString.equals("--CH"))
            {
                status.setText("Falha ao transmitir dados");
            }


        }
    };

    public void mandaConexao()
    {
        ((BaseAplicacao)this.getApplicationContext()).setConnect(connect);

    }

    public void buscarConexao()
    {
        connect = ((BaseAplicacao)this.getApplicationContext()).getConnect();

    }


}
