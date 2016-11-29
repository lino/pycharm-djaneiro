import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider;
import org.jetbrains.annotations.Nullable;

public class DjangoTemplateProvider implements DefaultLiveTemplatesProvider {
    @Override
    public String[] getDefaultLiveTemplateFiles() {
        return new String[] {
            "liveTemplates/Djaneiro_Completions",
            "liveTemplates/Djaneiro_Forms",
            "liveTemplates/Djaneiro_Models",
            "liveTemplates/Djaneiro_Python",
            "liveTemplates/Djaneiro_Templates",
            "liveTemplates/Djaneiro_Views"
        };
    }

    @Nullable
    @Override
    public String[] getHiddenLiveTemplateFiles() {
        return new String[0];
    }
}