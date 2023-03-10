package questions;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class QuestionThree implements IQuestion
{

    private String answer, text;
    private List<String> digits = new ArrayList<>();
    private List<String> texts = new ArrayList<>();

    public QuestionThree(String text)
    {
        this.text = text;

        String docPath = "src/questions";
        String fileName = "numbers.csv";
        Path path = Paths.get(docPath);
        Path filePath = path.resolve(fileName);

        try
        {
            CSVParser parser = CSVParser.parse(filePath, Charset.defaultCharset(), CSVFormat.DEFAULT.withHeader("digit", "text"));
            Stream<CSVRecord> stream = StreamSupport.stream(parser.spliterator(), false);
            List<Map<String, String>> temp = stream.skip(1).map(record -> record.toMap()).collect(Collectors.toList());

            digits = temp.stream().map(row -> row.get("digit")).collect(Collectors.toList());
            texts = temp.stream().map(row -> row.get("text")).collect(Collectors.toList());

        }catch (Exception e) {e.printStackTrace();}

        process();
    }

    @Override
    public void process()
    {
        answer = "error";

        for (int i = 0; i < texts.size(); i++) if (text.equals(texts.get(i))) answer = digits.get(i);
    }

    @Override
    public String getAnswer() {return answer;}

    @Override
    public boolean isOkay()
    {
        return false;
    }
}
