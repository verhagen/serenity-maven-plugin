package net.serenitybdd.maven.plugins;

import net.thucydides.core.reports.ResultChecker;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

import java.io.File;

/**
 * A Maven plug-in that checks the Serenity test results, for Errors and Failures.
 * The checks are done on existing output files, which can be in XML or JSON format.
 */
@Mojo(name = "check")
public class SerenityCheckMojo extends AbstractMojo {
    /**
     * The reports are loaded from the location where the test result reports have been stored.
     */
    @Parameter(property = "outputDirectory", defaultValue = "${project.build.directory}/site/serenity", required=true)
    public File outputDirectory;

    protected ResultChecker getResultChecker() {
        return new ResultChecker(outputDirectory);
    }

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Checking Serenity test results");
        getResultChecker().checkTestResults();
    }
}
