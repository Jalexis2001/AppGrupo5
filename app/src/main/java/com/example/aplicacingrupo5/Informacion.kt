package com.example.aplicacingrupo5

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Informacion : AppCompatActivity() {

    var tvTitulo: TextView? = null
    var tvCuerpo: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvTitulo = findViewById(R.id.txtTitulo2)
        tvCuerpo = findViewById(R.id.txtCuerpo2)

        val opcionData = intent.getStringExtra("com.estudio.aplicacingrupo5.MainActivity")
        Toast.makeText(this, opcionData, Toast.LENGTH_SHORT).show()

        val opcionQue = Opcion("¿Qué Brinda?", "Institución que brinda beneficios de seguridad social a la población de Honduras, en primer lugar en el entorno de la protección de las contingencias de enfermedad y maternidad, y luego en el ámbito de las pensiones de invalidez, vejez y muerte, a los trabajadores hondureños y sus familias. Fue fundado el 19 de mayo de 1959, mediante Decreto legislativo No.140., Creado por el Estado, con rango constitucional, para ser la institución de servicios públicos, de carácter obligatorio para todos los empleadores y trabajadores de Honduras, sean de Empresas Nacionales o Extranjeras.")
        val opcionVym = Opcion("Visión y Misión", "Es una Institución que brinda beneficios de seguridad social a la población de Honduras, en primer lugar en el entorno de la protección de las contingencias de enfermedad y maternidad, y luego en el ámbito de las pensiones de invalidez, vejez y muerte, a los trabajadores hondureños y sus familias. Fue fundado el 19\n" +
                "de mayo de 1959, mediante Decreto legislativo No.140., Creado por el Estado, con rango constitucional, para ser la institución de servicios públicos, de carácter obligatorio para todos los empleadores y trabajadores de Honduras, sean de Empresas Nacionales o Extranjeras." +
                "Somos una institución de seguridad social, que mediante una organización tecnificada y de cobertura nacional, garantiza el acceso a servicios, con enfoque de calidad, eficiencia, eficacia, equidad y calidez, orientado a la persona y para beneficio de la familia, en procura de contribuir a la prosperidad integral de Honduras.")
        val opcionRegimenes = Opcion("Regimenes", "Régimen del Seguro de Previsión Social Tiene por objeto garantizar los medios económicos de subsistencia, ante la ocurrencia de la invalidez, vejez o muerte." +
                "Régimen del Seguro de Atención de la Salud Tiene como propósito que todas las personas que forman parte de la población, tengan acceso equitativo a las prestaciones y servicios integrales que necesitan a lo largo del curso de la" +
                "vida, en el marco del ejercicio efectivo del derecho fundamental de la Salud, con calidad y sin dificultades financieras" +
                "Régimen del Seguro de Riesgos Profesionales tiene el propósito de proteger integralmente al (la) trabajador(a) ante la ocurrencia de Accidentes de Trabajo y Enfermedades Profesionales y la reparación del daño económico que pudiere causarle a él (ella)  y a sus familiares, conforme lo que disponga la Ley del Seguro Social, el Código de Trabajo, sus Reglamentos y demás normativa aplicable)"
        val
            val opcionServicios = Opcion("Servicios", "Solicitud Pensión de trabajadores" +
                "Hoja de ruta de pensiones" +
                "Sistema de consultas médicas" +
                "Consulta de vigencia de derechos")

        if(opcionData == "Opcion: ¿Qué brinda?"){
            tvTitulo?.text = opcionQue.Titulo
            tvCuerpo?.text = opcionQue.Cuerpo
        } else if (opcionData == "Opcion: Visión y Misión"){
            tvTitulo?.text = opcionVym.Titulo
            tvCuerpo?.text = opcionVym.Cuerpo
        } else if (opcionData == "Opcion: Regimenes"){
            tvTitulo?.text = opcionRegimenes.Titulo
            tvCuerpo?.text = opcionRegimenes.Cuerpo
        } else if (opcionData == "Opcion: Servicios"){
            tvTitulo?.text = opcionServicios.Titulo
            tvCuerpo?.text = opcionServicios.Cuerpo

        }