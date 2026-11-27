FreeTrial100 — aplicación Android educativa independiente

IMPORTANTE
Este paquete contiene el proyecto fuente y un flujo de compilación de GitHub Actions.
NO contiene todavía un APK compilado. La prueba local de 100 días es una demostración
educativa; cambiar la fecha del teléfono o borrar los datos puede alterar el resultado.
No modifica 9xbuddy ni sus licencias.

SUBIR DESDE ANDROID (sin PC)
1. Descarga y descomprime este ZIP con la app Archivos de tu teléfono.
2. Entra en https://github.com e inicia sesión.
3. Pulsa + > New repository. Nombre: FreeTrial100. Crea el repositorio.
4. En el repositorio pulsa Add file > Upload files.
5. Selecciona y sube TODO el contenido de la carpeta FreeTrial100 descomprimida,
   incluyendo la carpeta oculta .github. Si no aparece .github, activa "mostrar
   archivos ocultos" en el gestor de archivos o crea el archivo del workflow
   manualmente en .github/workflows/android.yml.
6. Pulsa Commit changes y confirma.

COMPILAR
1. Abre la pestaña Actions del repositorio.
2. Selecciona "Build Android APK".
3. Pulsa Run workflow si el flujo no comenzó automáticamente al subir a main.
4. Espera a que el trabajo termine en verde.
5. Abre la ejecución completada y descarga el artefacto
   "FreeTrial100-debug-apk". Dentro estará app-debug.apk.

Si GitHub no permite seleccionar carpetas desde el móvil, sube primero los archivos
y carpetas visibles, y después crea .github/workflows/android.yml con Add file >
Create new file usando exactamente esa ruta.

No compartas contraseña, códigos 2FA ni tokens de GitHub en el chat.
